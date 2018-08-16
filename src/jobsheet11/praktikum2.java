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