/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import uni.sistemas.entity.Item;
import uni.sistemas.service.Comprobante;
import uni.sistemas.util.Constante;

/**
 *
 * @author Alumno
 */
public class Factura extends Comprobante {

    @Override
    public Item[] Documento(double total) {
        double consumo = total / (1 + Constante.IGV);
        double impuesto = total - consumo;
        double servicio = total * Constante.SERVICIO;
        double totalgeneral = total + servicio;

        Item[] doc = new Item[5];

        doc[0] = new Item("Consumo", consumo);
        doc[1] = new Item("Impuesto", impuesto);
        doc[2] = new Item("Total ", total);
        doc[3] = new Item("Servicio(10%)", servicio);
        doc[4] = new Item("Total General", totalgeneral);
        return doc;
    }

}
