package suite;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TestGetPromovabilitate;
import main.TestGrupa;
import main.TestGrupaFake;
import main.TestGrupaStub;


	@RunWith(Suite.class)
	@SuiteClasses({TestGrupaFake.class, TestGrupaStub.class,TestGrupa.class, SuitaCompleta.class})
	@IncludeCategory({TestGetPromovabilitate.class})
	public class SuitaPersonalizata {

	}


