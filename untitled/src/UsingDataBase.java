import java.sql.*;
import java.util.Scanner;
public class UsingDataBase {
    Scanner sc = new Scanner(System.in);
    private final Connection connection;
    public static final UsingDataBase instance = new UsingDataBase();
    public UsingDataBase()
    {
        this.connection = DatabaseConnection.getConnection();
    }
    public void GetAllBooks()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from book order by id desc";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    public void SelectOneBook()
    {
        try {
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM book WHERE id = ?");
            int id = sc.nextInt();
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("BookName") + "; " + resultSet.getString("BookAuthor"));
            }
            else {
                System.out.println("No record found with the given ID.");
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    public void GetBooksByPrice2500()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from book where prise = 2500";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    public void GetBooksByPrice4000()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from book where prise = 2500";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    public void GetBooksByPrice5000()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from book where prise = 2500";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    public void GetBooksByPrice7000()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from book where prise = 2500";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    public void GetBooksByPrice10000()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from book where prise = 2500";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
}
