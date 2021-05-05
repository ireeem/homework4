package homework4;

public class CampaignManager implements CampaignService {
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasý sisteme eklendi.");
		
	}
	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasý sistemden silindi.");
		
	}
	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasý güncellendi.");
		
	}

}
