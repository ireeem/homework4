package homework4;

public class MernisManager  implements ValidationService{
@Override
public boolean ValidatePerson(Gamer gamer) {
if(gamer.getFirstName()=="�rem" && gamer.getLastName()=="Can" && gamer.getIdentityNumber()=="5623" && gamer.getBirthYear()=="2002") {
	System.out.println(gamer.getFirstName() +" do�rulama ba�ar�l�.");
	return true;
}else {
	System.out.println("Do�rulama ba�ar�s�z.");
	return false;
}
}
}
