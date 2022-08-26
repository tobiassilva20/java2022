package aula46;

/*
 * Uma interface pode herdar os comportamentos e atributos de quantas interfaces forem
 * necessárias.
 */
public interface DataBase extends SqlDCL, SqlDDL, SqlDML{
    void openConnection();
    void closeConnection();
}
