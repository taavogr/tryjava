/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import uni.sistemas.entity.Alumno;
import uni.sistemas.repositorio.ICrudDao;

/**
 *
 * @author Alumno
 */
public class AlumnoDaoMemory implements ICrudDao<Alumno> {

    Alumno arr[];
    static int count, n;

    public AlumnoDaoMemory() {
        arr = new Alumno[100];
        count = 0;
        n = 0;
    }

    @Override
    public void create(Alumno t) {
        count++;
        t.setId(count);
        arr[n] = t;
        n++;

    }

    @Override
    public void update(Alumno t) {

        int index = 0;
        for (Alumno alumno : arr) {
            if (alumno.getId() == t.getId()) {
                arr[index] = t;
                break;
            }
            index++;
        }

    }

    @Override
    public void delete(Alumno t) {
        for (int i = 0; i < n; i++) {
            if (arr[i].getId()==t.getId()) {
                for (int j = i; j < n; j++) {
                    arr[j]=arr[j+1];
                }
                n--;
                break;
            }
        }

    }

    @Override
    public Alumno fin(int t) {

        for (Alumno x : arr) {
            if (x.getId() == t) {

                return x;
            }

        }
        return null;

    }

    @Override
    public Alumno[] readAll() {
        Alumno[] aux;
        if (n == 100) {
            aux = arr;
        } else {
            aux=new Alumno[n];
            System.arraycopy(arr, 0, aux, 0, n);

        }
        return aux;

    }

}
