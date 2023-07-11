public class Taxes {
    private final static float COOUNTY_TAX_RATE = 0.07F, SCHOOL_TAX_RATE = 0.025F, MUNICIPAL_TAX_RATE = 0.03F,
            FIVE_THOUSAND = 5000;

    private float earning, county_tax, school_tax, municipal_tax;

    public Taxes(float gross) {
        earning = gross;
    }

    public void calculateTaxes() {
        if (earning > FIVE_THOUSAND) {
            county_tax = earning * COOUNTY_TAX_RATE;
            school_tax = earning * SCHOOL_TAX_RATE;
            municipal_tax = earning * MUNICIPAL_TAX_RATE;
        }

    }

    public float getEarning() {
        return earning;
    }

    public float getCounty() {
        return county_tax;
    }

    public float getSchool() {
        return school_tax;
    }

    public float getMunicipal() {
        return municipal_tax;
    }
}