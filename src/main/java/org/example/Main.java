package org.example;


public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        // Создание объектов Person
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Сохранение объектов в базу данных
        personDAO.savePerson(person1);
        personDAO.savePerson(person2);

        // Обновление объекта Person
        person1.setAge(26);
        personDAO.updatePerson(person1);

        // Удаление объекта Person
        personDAO.deletePerson(person2.getId());

        // Получение всех объектов Person из базы данных
        personDAO.getAllPersons().forEach(System.out::println);

        System.out.println("Операции с объектами Person были успешно выполнены.");
    }
}
