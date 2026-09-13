/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn_voviethung_9735_22.student;

/**
 *
 * @author 218to
 */
public class student {
      private String id;
    private String name;
    private ArrayList<Double> grades;

    public Student() {
        grades = new ArrayList<Double>();
    }

    public void addInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
    }
}
