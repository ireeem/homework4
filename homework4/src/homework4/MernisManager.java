package homework4;

public class MernisManager  implements ValidationService{
@Override
public boolean ValidatePerson(Gamer gamer) {
if(gamer.getFirstName()=="Ýrem" && gamer.getLastName()=="Can" && gamer.getIdentityNumber()=="5623" && gamer.getBirthYear()=="2002") {
	System.out.println(gamer.getFirstName() +" doðrulama baþarýlý.");
	return true;
}else {
	System.out.println("Doðrulama baþarýsýz.");
	return false;
}
}
}
