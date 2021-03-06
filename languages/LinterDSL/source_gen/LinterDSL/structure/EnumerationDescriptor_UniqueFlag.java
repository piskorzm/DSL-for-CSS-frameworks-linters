package LinterDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import java.util.Arrays;

public class EnumerationDescriptor_UniqueFlag extends EnumerationDescriptorBase {

  public EnumerationDescriptor_UniqueFlag() {
    super(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x7f24bdd32ecc3df6L, "UniqueFlag", "r:21d30a29-243b-40e8-a51d-38ea30739819(LinterDSL.structure)/9161656256699317750", PrimitiveTypeId.BOOLEAN);
  }

  private final EnumerationDescriptor.MemberDescriptor VALUE_false_0 = new EnumerationDescriptor.MemberDescriptor("false", "at least", "r:21d30a29-243b-40e8-a51d-38ea30739819(LinterDSL.structure)/9161656256699317751", "at least");
  private final EnumerationDescriptor.MemberDescriptor VALUE_true_0 = new EnumerationDescriptor.MemberDescriptor("true", "exactly", "r:21d30a29-243b-40e8-a51d-38ea30739819(LinterDSL.structure)/9161656256699317752", "exactly");

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return VALUE_false_0;
  }

  @NotNull
  @Override
  public Collection<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return Arrays.asList(VALUE_false_0, VALUE_true_0);
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String string) {
    if (string == null) {
      return null;
    }
    switch (string) {
      case "false":
        return VALUE_false_0;
      case "true":
        return VALUE_true_0;
    }
    return null;
  }
}
