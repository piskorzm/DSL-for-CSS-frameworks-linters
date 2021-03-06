package LinterDSL.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class SelectorDefinition_Constraints extends BaseConstraintsDescriptor {
  public SelectorDefinition_Constraints() {
    super(MetaAdapterFactory.getConcept(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x4c70f606bbdebb96L, "LinterDSL.structure.SelectorDefinition"));
  }

  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L), this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }
      @Override
      public boolean validateValue(SNode node, String propertyValue) {
        String propertyName = "name";
        {
          boolean validId = true;

          for (SNode sibling : Sequence.fromIterable(SNodeOperations.ofConcept(SNodeOperations.getPrevSiblings(node, false), MetaAdapterFactory.getConcept(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x4c70f606bbdebb96L, "LinterDSL.structure.SelectorDefinition")))) {
            if ((SPropertyOperations.getString(propertyValue)) == SPropertyOperations.getString(sibling, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))) {
              validId = false;
            }
          }

          return validId;
        }
      }
    });
    return properties;
  }
}
