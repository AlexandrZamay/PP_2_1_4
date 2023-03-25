package koschei.models;


import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {
    @Autowired //подсвечивается красным. Если убрать бин из cnf и поставить @Component у
    private Deth8 death;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death.toString();
    }
}
