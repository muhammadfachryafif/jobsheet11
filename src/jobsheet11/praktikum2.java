 private static void tampilJudul(String identitas){
        System.out.println("Identitas : "+ identitas);        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    
    public static void main(String[] args){    
        String identitas = " Muhammad Fachry Afif / X RPL 2 / 22 ";        
        tampilJudul(identitas); 
 private static String tampilInput(){
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
  
        String kalimat = tampilInput();
  private static String vocal2Angka(String kalimat){
        char [][] arConvert = 
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};        
        kalimat = kalimat.toLowerCase();
        for(int i=0;i<arConvert.length;i++)
        kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);        
        return kalimat;
    }
String convert = vocal2Angka(kalimat);
 private static void tampilPerKata(String kalimat, String convert){
        String[]arrKal = kalimat.split(" ");
        String[]arrcon = convert.split(" ");       
        for(int i=0;i<arrKal.length;i++)
        System.out.println(arrKal[i]+" => "+arrcon[i]);
        tampilPerKata(kalimat,convert);
    }    