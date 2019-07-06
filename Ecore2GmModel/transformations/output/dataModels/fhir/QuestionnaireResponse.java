/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type QuestionnaireResponse of the Data Model fhir.
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
{@link identifier}, 
{@link basedOn}, 
{@link partOf}, 
{@link subject}, 
{@link encounter}, 
{@link author}, 
{@link source}, 
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getPartOf},
{@link getSubject},
{@link getEncounter},
{@link getAuthor},
{@link getSource},
{@link getItem},
{@link setIdentifier},
{@link setBasedOn},
{@link setPartOf},
{@link setSubject},
{@link setEncounter},
{@link setAuthor},
{@link setSource},
{@link setItem},
 */

@Description("A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.If the element is present, it must have either a @value, an @id, or extensions")

public interface QuestionnaireResponse extends GenericEntity, fhir.FhirDomainResource {

	EntityType<QuestionnaireResponse> T = EntityTypes.T(QuestionnaireResponse.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String partOf = "partOf";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String author = "author";
	java.lang.String source = "source";
	java.lang.String item = "item";

	@Description("A business identifier assigned to a particular completed (or partially completed) questionnaire.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
	@Description("The person who answered the questions about the subject.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSource();
	void setSource(com.braintribe.model.generic.GenericEntity source);
	@Description("A group or question item from the original questionnaire for which answers are provided.")
	
	java.util.List<fhir.QuestionnaireResponseItem> getItem();
	void setItem(java.util.List<fhir.QuestionnaireResponseItem> item);

}
