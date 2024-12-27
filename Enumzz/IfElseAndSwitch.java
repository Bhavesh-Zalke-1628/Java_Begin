
enum Status {
    Runnig, Failed, Pending, Success;
}

class IfElseAndSwitch {
    public static void main(String[] args) {

        Status s = Status.Failed;

        // if (s == Status.Runnig) {
        // System.out.println("All Good");
        // } else if (s == Status.Failed) {
        // System.out.println("Try Again");
        // } else if (s == Status.Pending) {
        // System.out.println("Please wait");
        // } else {
        // System.out.println("Ok Done");
        // }

        switch (s) {
            case Runnig:
                System.out.println("All Good");

                break;
            case Pending:
                System.out.println("Wait");

                break;
            case Failed:
                System.out.println("Try again");
                break;

            default:
                System.out.println("Done");
        }
    }

}