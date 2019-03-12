package LinterDSL.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Linter_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("//import * from 'jquery.min'; ");
    tgs.newLine();
    tgs.newLine();

    tgs.append("jQuery.expr[':'].regex = function(elem, index, match) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var matchParams = match[3].split(','), validLabels = /^(data|css):/,");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("attr = {method: matchParams[0].match(validLabels) ?  matchParams[0].split(':')[0] : 'attr', property: matchParams.shift().replace(validLabels,'')},");
    tgs.newLine();
    tgs.indent();
    tgs.append("regexFlags = 'ig', regex = new RegExp(matchParams.join('').replace(/^\\s+|\\s+$/g,''), regexFlags);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("return regex.test(jQuery(elem)[attr.method](attr.property));");
    ctx.getBuffer().area().decreaseIndent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.append("function childrenTypeCheck(id, type, applyTo, allowedChildrenSelectors) {");
    tgs.newLine();
    tgs.newLine();

    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!disabledChecks.includes(id)) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (singleDomIterationMode) {");
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var inappropriateChildren = $(investigatedElement).children(':not(' + allowedChildrenSelectors.join(', ') + ')').toArray();");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (inappropriateChildren.length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'InappropriateChildren' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' can only have children matching ' + allowedChildrenSelectors.join(' or ') + '. Element: ';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, investigatedElement, '\\n InappropriateChildren: ', inappropriateChildren);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, investigatedElement, '\\n InappropriateChildren: ', inappropriateChildren);");
    tgs.newLine();

    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("} else {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var elementsWithInappropriateChildren = $(applyTo.join(', ') + ' > :not(' + allowedChildrenSelectors.join(', ') + ')').parent().toArray();");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (elementsWithInappropriateChildren.length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'InappropriateChildren' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' can only have children matching ' + allowedChildrenSelectors.join(' or ') + '. Elements with inappropriate children: ';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, elementsWithInappropriateChildren);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, elementsWithInappropriateChildren);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();

    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();

    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.indent();
    tgs.append("function requiredChildCheck(id, type, applyTo, requiredChildSelectors) {");
    tgs.newLine();
    tgs.newLine();

    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!disabledChecks.includes(id)) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (singleDomIterationMode) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!$(investigatedElement).children(requiredChildSelectors.join(', ')).toArray().length) {");
    tgs.newLine();

    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'RequiredChildren' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' must have at least one child matching ' + requiredChildSelectors.join(' or ') + '. Element: ';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("} else {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var elementsMissingChildren = [];");
    tgs.newLine();
    tgs.indent();
    tgs.append("$(applyTo.join(', ')).each(function() {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!$(this).children(requiredChildSelectors.join(', ')).length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("elementsMissingChildren.push($(this).get(0));");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("});");
    tgs.newLine();

    tgs.indent();
    tgs.append("if ($(elementsMissingChildren.length)) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'RequiredChildren' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' must have at least one child matching ' + requiredChildSelectors.join(' or ') + '. Elements missing required children: ';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, elementsMissingChildren);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, elementsMissingChildren);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.append("function misuseCheck(id, type, applyTo, requiredSelectors) {");
    tgs.newLine();
    tgs.newLine();

    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!disabledChecks.includes(id)) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (singleDomIterationMode) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if ($(investigatedElement).filter(':not(' + requiredSelectors.join(', ') + ')').length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'ElementMissuse' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' must also match ' + requiredSelectors.join(' or ') + '. Element: ';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("} else {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var missingRequiredSelectors = $(applyTo.join(', ')).filter(':not(' + requiredSelectors.join(', ') + ')').toArray();");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (missingRequiredSelectors.length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'ElementMissuse' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' must also match ' + requiredSelectors.join(' or ') + '. Misused elements: ';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, missingRequiredSelectors);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, missingRequiredSelectors);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    ctx.getBuffer().area().decreaseIndent();

    ctx.getBuffer().area().decreaseIndent();

    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();

    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.append("function missingElementCheck(id, type, applyTo) {");
    tgs.newLine();
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.append("if (!disabledChecks.includes(id)) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (singleDomeIterationMode) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var requiredElement.find(e => e.id === id); {");
    tgs.newLine();
    tgs.indent();
    tgs.append("if (requiredElement !== undefined && requiredElement === false) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("requiredElement.missing = !$(investigatedElement).filter(applyTo.join(', ')).length;");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    tgs.indent();
    tgs.append("if (requiredElement === undefined) {");
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("requiredElement = {applyTo: applyTo, id: id, type: type, missing: !$(investigatedElement).filter(applyTo.join(', ')).length};");
    tgs.newLine();
    tgs.indent();
    tgs.append("requiredElements.push(requiredElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("} else {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!$(applyTo.join(', ')).length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'MissingElement' + type + ' {check id: ' + id + '): presence of an element matching ' + applyTo.join(' or ') + ");
    tgs.append("' is required by ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ad1L, 0x74695853078e2b1eL, "framework")));
    tgs.append(".';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();

    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.append("function invalidElementCheck(id, type, applyTo) {");
    tgs.newLine();
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!disabledChecks.includes(id)) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (singleDomIterationMode) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if ($(investigatedElement).filter(applyTo.join(', ')).length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'InvalidElement' + type + ' {check id: ' + id + '): elements matching ' + applyTo.join(' or ') + ");
    tgs.append("' are not valid in ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ad1L, 0x74695853078e2b1eL, "framework")));
    tgs.append(". Element: ';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();

    tgs.indent();
    tgs.append("} else {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var invalidElements = ($(applyTo.join(', ')).toArray());");
    tgs.newLine();
    tgs.indent();
    tgs.append("if (invalidElements.length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'InvalidElement' + type + ' {check id: ' + id + '): elements matching ' + applyTo.join(' or ') + ");
    tgs.append("' are not valid in ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ad1L, 0x74695853078e2b1eL, "framework")));
    tgs.append(". InvalidElements: ';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, invalidElements);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, invalidElements);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();

    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();

    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.indent();
    tgs.append("function parentTypeCheck(id, type, applyTo, allowedDirectParents) {");
    tgs.newLine();
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!disabledChecks.includes(id)) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (singleDomIterationMode) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!$(investigatedElement).parent(allowedDirectParents.join(', ')).length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'DirectParent' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' can only be direct children of elements matching: ' + allowedDirectParents.join(' or ') + '. Elements: '");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("} else {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var elementsWithInappropriateParents = [];");
    tgs.newLine();
    tgs.newLine();
    tgs.indent();
    tgs.append("$(applyTo.join(', ')).each(function () {");
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!$(this).parent(allowedDirectParents.join(', ')).length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("elementsWithInappropriateParents.push($(this).get(0));");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("});");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (elementsWithInappropriateParents.length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'DirectParent' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' can only be direct children of elements matching: ' + allowedDirectParents.join(' or ') + '. Elements with inappropriate parents: '");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, elementsWithInappropriateParents);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, elementsWithInappropriateParents);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.indent();
    tgs.append("function predecessorsTypeCheck(id, type, applyTo, requiredPredecessorSelectors) {");
    tgs.newLine();
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!disabledChecks.includes(id)) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (singleDomIterationMode) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!$(investigatedElement).parents(requiredPredecessorSelectors.join(', ')).length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'Predecessor' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' must be descendants of an element matching: ' + requiredPredecessorSelectors.join(' or ') + '. Elements: '");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, investigatedElement);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("} else {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var elementsWithInappropriateParents = [];");
    tgs.newLine();
    tgs.newLine();
    tgs.indent();
    tgs.append("$(applyTo.join(', ')).each(function () {");
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (!$(this).parent(requiredPredecessorSelectors.join(', ')).length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("elementsWithInappropriateParents.push($(this).get(0));");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("});");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (elementsWithInappropriateParents.length) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'Predecessor' + type + ' {check id: ' + id + '): elements which satisfy ' + applyTo.join(' or ') + ");
    tgs.append("' must be descendants of an element matching: ' + requiredPredecessorSelectors.join(' or ') + '. Elements with inappropriate parents: '");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message, misplacedElements);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message, misplacedElements);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.append("function printMissingElementChecks() {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("for (requiredElement in requiredElements) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("if (requiredElement.missing) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("var message = 'MissingElement' + requiredElement.type + ' {check id: ' + requiredElement.id + '): presence of an element matching ' + applyTo.join(' or ') + ");
    tgs.append("' is required by ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ad1L, 0x74695853078e2b1eL, "framework")));
    tgs.append(".';");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (requiredElement.type === 'Warning') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.warn(message);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();

    tgs.indent();
    tgs.append("if (requiredElement.type === 'Error') {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("console.error(message);");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();


    tgs.append("function runChecks() {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    for (SNode item : SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0xc400f4156edc4c5fL, 0xa0ceccbb04f551e6L, 0x74695853078e2ad1L, 0x74695853078e2ae6L, "checks"))) {
      tgs.appendNode(item);
    }
    ctx.getBuffer().area().decreaseIndent();
    tgs.append("}");
    tgs.newLine();
    tgs.newLine();

    tgs.append("var singleDomIterationMode = false;");
    tgs.newLine();
    tgs.append("var requiredElemets = [];");
    tgs.append("var domElements = [];");
    tgs.newLine();
    tgs.append("var investigatedElement;");
    tgs.newLine();
    tgs.append("var disabledChecks = [];");
    tgs.newLine();
    tgs.newLine();
    tgs.append("function ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
    tgs.append("(mode, disable) {");
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("singleDomIterationMode = mode;");
    tgs.newLine();
    tgs.indent();
    tgs.append("disabledChecks = disable;");
    tgs.newLine();
    tgs.newLine();
    tgs.indent();
    tgs.append("if (singleDomIterationMode) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("domElements = document.querySelectorAll('*');");
    tgs.newLine();
    tgs.indent();
    tgs.append("for (element in domElements) {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("investigatedElement = element;");
    tgs.newLine();
    tgs.indent();
    tgs.append("runChecks();");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("} else {");
    tgs.newLine();
    ctx.getBuffer().area().increaseIndent();
    tgs.indent();
    tgs.append("runChecks();");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.indent();
    tgs.append("}");
    tgs.newLine();
    ctx.getBuffer().area().decreaseIndent();
    tgs.append("}");
    tgs.newLine();
  }
}
