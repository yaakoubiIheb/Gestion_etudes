package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {



    public static void createTableSubject() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Subject ("+
                    "id serial primary key ,"+
                    "name varchar not null,"+
                    "type varchar not null,"+
                    "level varchar not null"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Subject table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }










    public static void createTableGroup() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Student_group ("+
                    "id serial primary key ,"+
                    "name varchar not null,"+
                    "nbr_student integer not null,"+
                    "email varchar not null,"+
                    "level varchar not null"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Group table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }


    }





    public static void createTableTeacher() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Teacher ("+
                    "id serial primary key ,"+
                    "first_name varchar not null,"+
                    "last_name varchar not null,"+
                    "personal_email varchar not null,"+
                    "profesional_email varchar not null,"+
                    "photo varchar not null"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Teacher table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }













    public static void createTableTeaching() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con = DbConnection.connect();
            //step 2-Write the sql request
            String request = "create table if not exists Teaching (" +
                    "id serial primary key ," +
                    "teacher_id serial not null REFERENCES teacher(id) ON delete cascade," +
                    "subject_id serial not null REFERENCES subject(id) ON delete cascade," +
                    "type varchar not null," +
                    "nbr_hours integer not null" +

                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Teaching table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DbConnection.closeConnection();
        }

    }










    public static void createTableStudent() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Student ("+
                    "id serial primary key ,"+
                    "first_name varchar not null,"+
                    "last_name varchar not null,"+
                    "email varchar not null,"+
                    "birthdate date not null,"+
                    "photo varchar not null," +
                    "state varchar not null," +
                    "group_id serial not null REFERENCES Student_group(id) ON delete cascade"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Student table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }











    public static void createTableSession() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Session ("+
                    "id serial primary key ,"+
                    "start_hour varchar not null,"+
                    "finish_hour varchar not null,"+
                    "classroom int,"+
                    "session_date date not null,"+
                    "goal varchar," +
                    "summary varchar," +
                    "tools varchar," +
                    "type varchar," +
                    "group_id serial not null REFERENCES Student_group(id) ON delete cascade,"+
                    "subject_id serial not null REFERENCES subject(id) ON delete cascade"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Session table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }











    public static void createTableFollow() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Follow ("+
                    "id serial primary key ,"+
                    "group_id serial not null REFERENCES Student_group(id) ON delete cascade,"+
                    "subject_id serial not null REFERENCES subject(id) ON delete cascade"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Follow table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }








    public static void createTableAbsence() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Absence ("+
                    "id serial primary key ,"+
                    "purpose varchar,"+
                    "permision boolean not null,"+
                    "student_id serial not null REFERENCES Student(id) ON delete cascade,"+
                    "session_id serial not null REFERENCES session(id) ON delete cascade"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Absence table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }









    public static void createTableHomework() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Homework ("+
                    "id serial primary key ,"+
                    "nature varchar not null,"+
                    "title varchar not null,"+
                    "file varchar,"+
                    "description varchar not null,"+
                    "start_date date not null,"+
                    "deadline date not null,"+
                    "group_id serial REFERENCES Student_group(id) ON delete cascade,"+
                    "student_id serial REFERENCES Student(id) ON delete cascade,"+
                    "subject_id serial not null REFERENCES subject(id) ON delete cascade"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Homework table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }













    public static void createTableEvaluation() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Evaluation ("+
                    "id serial primary key ,"+
                    "mark numeric(4,2),"+
                    "comment varchar,"+
                    "file varchar not null,"+
                    "state varchar not null,"+
                    "student_id serial not null REFERENCES Student(id) ON delete cascade,"+
                    "homework_id serial not null REFERENCES homework(id) ON delete cascade"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Evaluation table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }







    public static void createTableRecording() throws SQLException {
        try {
            //step 1 : establish connection
            Connection con=DbConnection.connect();
            //step 2-Write the sql request
            String request ="create table if not exists Recording ("+
                    "id serial primary key ,"+
                    "name varchar not null,"+
                    "url varchar,"+
                    "path varchar not null,"+
                    "type varchar not null,"+
                    "description varchar not null,"+
                    "recording_date date not null,"+
                    "session_id serial not null REFERENCES session(id) ON delete cascade"+
                    ")";
            //step 3 : create Statement
            Statement stmt = con.createStatement();
            stmt.execute(request);
            System.out.println("The Homework table has been successfully created");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        finally {
            DbConnection.closeConnection();
        }
    }



}
