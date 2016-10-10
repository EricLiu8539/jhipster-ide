/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.formatting2

import com.google.inject.Inject
import io.github.jhipster.jdl.jdl.JdlDomainModel
import io.github.jhipster.jdl.jdl.JdlEntity
import io.github.jhipster.jdl.jdl.JdlEntityField
import io.github.jhipster.jdl.jdl.JdlEntitySelection
import io.github.jhipster.jdl.jdl.JdlFeature
import io.github.jhipster.jdl.jdl.JdlRelationships
import io.github.jhipster.jdl.services.JDLGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

import static io.github.jhipster.jdl.jdl.JdlPackage.Literals.*
import io.github.jhipster.jdl.jdl.JdlOption
import io.github.jhipster.jdl.jdl.JdlEnum

class JDLFormatter extends AbstractFormatter2 {
	
	@Inject extension JDLGrammarAccess

	def dispatch void format(JdlDomainModel jdlDomainModel, extension IFormattableDocument document) {
		jdlDomainModel.prepend[setNewLines(0, 0, 1); noSpace].append[newLine]
		for (JdlFeature element : jdlDomainModel.features) {
			format(element, document);
		}
	}

	def dispatch void format(JdlEnum jdlEnum, extension IFormattableDocument document) {
		val open = jdlEnum.regionFor.keyword('{') 
		val close = jdlEnum.regionFor.keyword('}')
		jdlEnum.regionFor.feature(JDL_ENUM__NAME).surround[oneSpace]
		open.append[newLine]
		interior(open, close)[indent]
		jdlEnum.regionFor.keywords(',').forEach[
			surround[noSpace].append[newLine]
		]
		close.prepend[newLine].append[newLines = 2]
	}

	def dispatch void format(JdlEntity entity, extension IFormattableDocument document) {
		val open = entity.regionFor.keyword('{') 
		val close = entity.regionFor.keyword('}')
		entity.regionFor.feature(JDL_ENTITY__NAME).surround[oneSpace]
		open.append[newLine]
		interior(open, close)[indent]
		for (JdlEntityField field : entity.fields) {
			field.format
		}
		entity.regionFor.keywords(',').forEach[
			surround[noSpace].append[newLine]
		]
		close.prepend[newLine].append[newLines = 2]
	}

	def dispatch void format(JdlRelationships relships, extension IFormattableDocument document) {
		val open = relships.regionFor.keyword('{') 
		val close = relships.regionFor.keyword('}')
		open.append[newLine]
		interior(open, close)[indent]
		relships.regionFor.keywords(',').forEach[
			surround[noSpace].append[newLine]
		]
		close.prepend[newLine].append[newLines = 2]
	}
	
	def dispatch void format(JdlOption option, extension IFormattableDocument document) {
		option.surround[oneSpace]//.append[newLines = 2]
		option.append[newLine]
	}
	
	def dispatch void format(JdlEntitySelection selection, extension IFormattableDocument document) {
		selection.regionFor.keywords(',').forEach[
			append[oneSpace; autowrap]
		]
	}
}
