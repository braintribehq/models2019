/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type QuestionnaireResponseAnswer of the Data Model fhir.
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
{@link valueAttachment}, 
{@link valueCoding}, 
{@link valueQuantity}, 
{@link valueReference}, 
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getValueAttachment},
{@link getValueCoding},
{@link getValueQuantity},
{@link getValueReference},
{@link getItem},
{@link setValueAttachment},
{@link setValueCoding},
{@link setValueQuantity},
{@link setValueReference},
{@link setItem},
 */

@Description("A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.")

public interface QuestionnaireResponseAnswer extends GenericEntity, fhir.BackboneElement {

	EntityType<QuestionnaireResponseAnswer> T = EntityTypes.T(QuestionnaireResponseAnswer.class);

	/* Constants for each property name. */
	java.lang.String valueAttachment = "valueAttachment";
	java.lang.String valueCoding = "valueCoding";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueReference = "valueReference";
	java.lang.String item = "item";

	@Description("")
	@Mandatory
	fhir.Attachment getValueAttachment();
	void setValueAttachment(fhir.Attachment valueAttachment);
	@Description("")
	@Mandatory
	fhir.Coding getValueCoding();
	void setValueCoding(fhir.Coding valueCoding);
	@Description("")
	@Mandatory
	fhir.Quantity getValueQuantity();
	void setValueQuantity(fhir.Quantity valueQuantity);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getValueReference();
	void setValueReference(com.braintribe.model.generic.GenericEntity valueReference);
	@Description("Nested groups and/or questions found within this particular answer.")
	
	java.util.List<fhir.QuestionnaireResponseItem> getItem();
	void setItem(java.util.List<fhir.QuestionnaireResponseItem> item);

}
