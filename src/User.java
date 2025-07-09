public class User{
    private String Ten;
    private String Email;
    private int Tuoi;
    private String QueQuan;
    private String SDT;

    public User(){

    }
    
    public String setTen(String ten){
        Ten = ten;
        return Ten;
    }
    public void getTen(){
        System.out.println("Ten User: " + Ten);
    }

    public String setEmail(String email){
        Email = email;
        return Email;
    }
    public void getEmail(){
        System.out.println("Email User: " + Email);
    }

    public int setTuoi(int tuoi){
        Tuoi = tuoi;
        return Tuoi;
    }
    public void getTuoi(){
        System.out.println("Tuoi User: " + Tuoi);
    }

    public String setSDT(String sdt){
        SDT = sdt;
        return SDT;
    }
    public void getSDT(){
        System.out.println("SDT User: "+ SDT);
    }

    public String setQueQuan(String quequan){
        QueQuan = quequan;
        return QueQuan;
    }
    public void getQueQuan(){
        System.out.println("QueQuan User: "+ QueQuan);
    }


}