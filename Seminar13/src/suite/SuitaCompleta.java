package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import main.TestGrupa;
import main.TestGrupaFake;
import main.TestGrupaStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaFake.class, TestGrupaStub.class,TestGrupa.class})
public class SuitaCompleta {

}
