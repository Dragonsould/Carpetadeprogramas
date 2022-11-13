public class Contador_de_Caracteres_o_elementos Main {
    public static void main(string[]args) {
    //este se trata de buscar los datos tanto mayusculas como minusculas//
    string  entrada="Buenos dias caballeros, el dia 19 de abril se Celebra el cumpleaños de Mathias";

    string Mayusculas="";
    string minusculas="";
    string numeros="";
    string  letras="";

    int 0_Mayusculas=0;
    int 0_minisculas=0;
    int 0_numeros=0;
    int 0_letras=0;
    int 0_espacios=0;   
    for (int i=0;i=entrada.lengh();i++){
 

        if(Character.isLetter(entrada.charAT(i))){
            0_letras++;
            letras+=entrada.charAT(i);

         }
         If(Character.isUpperCase(entrada.charAT(i))){
            0_Mayusculas++;
            Mayusculas+=entrada.charAT(i);
         }
         if (character.isLowerCase(entrada.charAt(i))){
            0_minusculas++;
            minusculas+=entrada.charAT(i);

            if(Character.isDigit(entrada.charAT(i))){
                0_numeros++;
                numeros+=entrada.charAT(i);

            
            }
            if(Character.IisSpaceChar(entrada.charAt(i))){
               0_espacios++;

            }
         }
       
        }
        System.out.println ("Cadena origina"+ entrada);   
        system.out.println("Mayusculas"+0_Mayusculas); "+"  
        system.out.println("minusculas"+ 0_minisculas);
        system.out.print("Numeros"+0_numeros);
        system.out.print("Letras"+0_letras);
        system.out.println("Espacios"+0_espacios);
    }
}
