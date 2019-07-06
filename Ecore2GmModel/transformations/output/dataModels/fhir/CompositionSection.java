/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CompositionSection of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link code}, 
{@link author}, 
{@link focus}, 
{@link text}, 
{@link orderedBy}, 
{@link entry}, 
{@link emptyReason}, 
{@link section}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getAuthor},
{@link getFocus},
{@link getText},
{@link getOrderedBy},
{@link getEntry},
{@link getEmptyReason},
{@link getSection},
{@link setCode},
{@link setAuthor},
{@link setFocus},
{@link setText},
{@link setOrderedBy},
{@link setEntry},
{@link setEmptyReason},
{@link setSection},
 */

@Description("A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).")

public interface CompositionSection extends GenericEntity, fhir.BackboneElement {

	EntityType<CompositionSection> T = EntityTypes.T(CompositionSection.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String author = "author";
	java.lang.String focus = "focus";
	java.lang.String text = "text";
	java.lang.String orderedBy = "orderedBy";
	java.lang.String entry = "entry";
	java.lang.String emptyReason = "emptyReason";
	java.lang.String section = "section";

	@Description("A code identifying the kind of content contained within the section. This must be consistent with the section title.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Identifies who is responsible for the information in this section, not necessarily who typed it in.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAuthor();
	void setAuthor(java.util.List<com.braintribe.model.generic.GenericEntity> author);

	@Description("The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getFocus();
	void setFocus(com.braintribe.model.generic.GenericEntity focus);
	@Description("A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it 'clinically safe' for a human to just read the narrative.")
	@Mandatory
	fhir.Narrative getText();
	void setText(fhir.Narrative text);
	@Description("Specifies the order applied to the items in the section entries.")
	@Mandatory
	fhir.CodeableConcept getOrderedBy();
	void setOrderedBy(fhir.CodeableConcept orderedBy);
	@Description("A reference to the actual resource from which the narrative in the section is derived.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEntry();
	void setEntry(java.util.List<com.braintribe.model.generic.GenericEntity> entry);

	@Description("If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.")
	@Mandatory
	fhir.CodeableConcept getEmptyReason();
	void setEmptyReason(fhir.CodeableConcept emptyReason);
	@Description("A nested sub-section within this section.")
	
	java.util.List<fhir.CompositionSection> getSection();
	void setSection(java.util.List<fhir.CompositionSection> section);

}
