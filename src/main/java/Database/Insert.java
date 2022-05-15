package Database;

import Models.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {




    public static void insertTeacher(Teacher teacher) throws SQLException {
        String sql = "INSERT INTO teacher VALUES(?,?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, teacher.getFirst_name());
            pstmt.setString(2, teacher.getLast_name());
            pstmt.setString(3, teacher.getPersonal_email());
            pstmt.setString(4, teacher.getProfesional_email());
            pstmt.setString(5, teacher.getPhoto());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }




    public static void insertSubject(Subject subject) throws SQLException {
        String sql = "INSERT INTO subject VALUES(?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, subject.getName());
            pstmt.setObject(2, subject.getType());
            pstmt.setString(3, subject.getLevel());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }





    public static void insertStudent_group(Group group) throws SQLException {
        String sql = "INSERT INTO student_group VALUES(?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, group.getName());
            pstmt.setInt(2, group.getNbr_students());
            pstmt.setString(3, group.getEmail());
            pstmt.setString(4, group.getLevel());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }








    public static void insertTeaching(Teaching teaching) throws SQLException {
        String sql = "INSERT INTO teaching VALUES(?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, teaching.getTeacher_id());
            pstmt.setInt(2, teaching.getSubject_id());
            pstmt.setObject(3, teaching.getType());
            pstmt.setInt(4, teaching.getNbr_hours());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }








    public static void insertStudent(Student student) throws SQLException {
        String sql = "INSERT INTO student VALUES(?,?,?,?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, student.getFirst_name());
            pstmt.setString(2, student.getLast_name());
            pstmt.setString(3, student.getEmail());
            pstmt.setObject(4, student.getBirthdate());
            pstmt.setString(5, student.getPhoto());
            pstmt.setObject(6, student.getState());
            pstmt.setInt(7, student.getId_group());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }








    public static void insertSession(Session session) throws SQLException {
        String sql = "INSERT INTO session VALUES(?,?,?,?,?,?,?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, session.getStart_hour());
            pstmt.setString(2, session.getFinish_hour());
            pstmt.setInt(3, session.getClassroom());
            pstmt.setObject(4, session.getSession_date());
            pstmt.setString(5, session.getGoal());
            pstmt.setString(6, session.getSummary());
            pstmt.setString(7, session.getTools());
            pstmt.setObject(8, session.getType());
            pstmt.setInt(9, session.getGroup_id());
            pstmt.setInt(10, session.getSubject_id());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }








    public static void insertFollow(Follow follow) throws SQLException {
        String sql = "INSERT INTO follow VALUES(?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, follow.getGroup_id());
            pstmt.setInt(2, follow.getSubject_id());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }










    public static void insertAbsence(Absence absence) throws SQLException {
        String sql = "INSERT INTO absence VALUES(?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, absence.getPurpose());
            pstmt.setBoolean(2, absence.getPermission());
            pstmt.setInt(3, absence.getId_student());
            pstmt.setInt(4, absence.getId_session());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }









    public static void insertHomework(Homework homework) throws SQLException {
        String sql = "INSERT INTO homework VALUES(?,?,?,?,?,?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, homework.getNature());
            pstmt.setString(2, homework.getTitle());
            pstmt.setString(3, homework.getFile());
            pstmt.setString(4, homework.getDescription());
            pstmt.setObject(5, homework.getStarting_date());
            pstmt.setObject(6, homework.getDeadline());
            pstmt.setInt(7, homework.getGroup_id());
            pstmt.setInt(8, homework.getStudent_id());
            pstmt.setInt(9, homework.getSubject_id());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }










    public static void insertEvaluation(Evaluation evaluation) throws SQLException {
        String sql = "INSERT INTO evaluation VALUES(?,?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setFloat(1, evaluation.getMark());
            pstmt.setString(2, evaluation.getComment());
            pstmt.setObject(3, evaluation.getState());
            pstmt.setInt(4, evaluation.getStudent_id());
            pstmt.setInt(5, evaluation.getHomework_id());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }









    public static void insertRecording(Recording recording) throws SQLException {
        String sql = "INSERT INTO recording VALUES(?,?,?,?,?,?,?)";

        try{
            Connection conn = DbConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, recording.getName());
            pstmt.setString(2, recording.getUrl());
            pstmt.setObject(3, recording.getType());
            pstmt.setString(4, recording.getDescription());
            pstmt.setObject(5, recording.getRecording_date());
            pstmt.setInt(6, recording.getSession_id());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            DbConnection.closeConnection();
        }
    }






}
