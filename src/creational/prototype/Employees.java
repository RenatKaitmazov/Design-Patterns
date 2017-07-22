package creational.prototype;

/**
 * @author Renat Kaitmazov
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * It is mandatory for Prototype design pattern
 * that a class implements {@link Cloneable} interface
 */
public final class Employees implements Cloneable {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final List<String> employees;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public Employees() {
        employees = new ArrayList<>();
    }

    public Employees(List<String> employees) {
        if (employees == null) {
            throw new IllegalArgumentException("Invalid argument for the constructor.");
        }
        this.employees = employees;
    }

    /*--------------------------------------------------------*/
    /* Getters
    /*--------------------------------------------------------*/

    public final List<String> getEmployees() {
        return employees;
    }

    /*--------------------------------------------------------*/
    /* Cloneable implementation
    /*--------------------------------------------------------*/

    @Override
    public final Object clone() throws CloneNotSupportedException {
        super.clone();
        final int size = employees.size();
        final List<String> temp = new ArrayList<>(size);
        for (int i = 0; i < size; ++i) {
            temp.add(employees.get(i));
        }
        return new Employees(temp);
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final void loadData() {
        employees.add("Renat");
        employees.add("Efendi");
        employees.add("Dzhiger");
        employees.add("Gamid");
        employees.add("Tariel");
    }
}
