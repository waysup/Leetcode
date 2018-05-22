import com.waysup.Student;

public class Student_Attendance_Record_I {



    public static void main(String[] args){

        Student_Attendance_Record_I solver = new Student_Attendance_Record_I();

        String testCase = "PPALLP";
        boolean result = solver.checkRecord(testCase);
        return;
    }

    public boolean checkRecord(String s) {

        char[] chars = s.toCharArray();
        int length = s.length();
        int i = 0;

        int AbsentCount = 0;
        int  LateCount = 0;
        while (i < length){
            switch (chars[i]){
                case 'A':
                    LateCount = 0;
                    if (++AbsentCount > 1)
                        return false;
                    i++;
                    break;
                case 'L':
                    if (++LateCount > 2)
                        return false;
                    i++;
                    break;
                    default:
                        LateCount = 0;
                        i++;
            }
        }
        return true;
    }
}
