package LinterDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ClassMisuseCheck_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("classMissuseCheck('");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
    tgs.append("', ");
    tgs.append(Integer.toString(SPropertyOperations.getInteger(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ae8L, 0x74695853078e2af2L, "id"))));
    tgs.append(", '");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ae8L, 0x74695853078e2aebL, "description")));
    tgs.append("', ");
    Linter_functions.toStringArray(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ae8L, 0x1419e78e679167d2L, "applyTo")), ctx);
    tgs.append(", ");
    Linter_functions.toStringArray(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x472d73cdfe35f711L, 0x472d73cdfe35f712L, "intendedTagTypes")), ctx);
    tgs.append(", '");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ae8L, 0x1419e78e679167cdL, "violationMessage")));
    tgs.append("');");
    tgs.newLine();
  }
}
