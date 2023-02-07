import java.sql.*;

public class Psychology extends UsingDataBase {
    private String genre;
    private Connection connection;
    public Psychology()
    {
        this.connection = DatabaseConnection.getConnection();
    }
    @Override
    public void GetAllBooks()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from psychology order by id desc";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    @Override
    public void SelectOneBook()
    {
        try {
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM psychology WHERE id = ?");
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
    @Override
    public void GetBooksByPrice2500()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from psychology where prise = 2500";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    @Override
    public void GetBooksByPrice4000()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from psychology where prise = 4000";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    @Override
    public void GetBooksByPrice5000()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from psychology where prise = 5000";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    @Override
    public void GetBooksByPrice7000()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from psychology where prise = 7000";
            ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
            while(result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("BookName") + "; " + result.getString("BookAuthor") + "; " + result.getInt("prise"));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    @Override
    public void GetBooksByPrice10000()
    {
        try {
            Statement statement = connection.createStatement();
            String SQL_SELECT_TASKS = "select * from psychology where prise = 10000";
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
