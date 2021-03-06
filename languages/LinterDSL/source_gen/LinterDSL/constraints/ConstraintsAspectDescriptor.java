package LinterDSL.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseConstraintsAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class ConstraintsAspectDescriptor extends BaseConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  @Override
  public ConstraintsDescriptor getConstraints(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return new AttributeSelector_Constraints();
      case 1:
        return new Check_Constraints();
      case 2:
        return new ClassSelector_Constraints();
      case 3:
        return new GroupSelector_Constraints();
      case 4:
        return new NotSelector_Constraints();
      case 5:
        return new PredecessorsCheck_Constraints();
      case 6:
        return new ReferenceSelector_Constraints();
      case 7:
        return new RequiredChildCheck_Constraints();
      case 8:
        return new SelectorDefinition_Constraints();
      case 9:
        return new SiblingsCheck_Constraints();
      case 10:
        return new TypeSelector_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x704031341929f121L), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ae8L), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x704031341929f113L), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x704031341929f116L), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x1634cab96f676dL), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x686f417f617be32cL), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x4c70f606bbdebc38L), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x7d9d4177b0175848L), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x4c70f606bbdebb96L), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x7f24bdd32ec2bc88L), MetaIdFactory.conceptId(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x704031341929f11bL)).seal();
}
