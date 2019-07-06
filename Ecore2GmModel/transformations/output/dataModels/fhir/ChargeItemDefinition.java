/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ChargeItemDefinition of the Data Model fhir.
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
{@link contact}, 
{@link useContext}, 
{@link jurisdiction}, 
{@link effectivePeriod}, 
{@link code}, 
{@link instance}, 
{@link applicability}, 
{@link propertyGroup}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getEffectivePeriod},
{@link getCode},
{@link getInstance},
{@link getApplicability},
{@link getPropertyGroup},
{@link setIdentifier},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setEffectivePeriod},
{@link setCode},
{@link setInstance},
{@link setApplicability},
{@link setPropertyGroup},
 */

@Description("The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.If the element is present, it must have either a @value, an @id, or extensions")

public interface ChargeItemDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ChargeItemDefinition> T = EntityTypes.T(ChargeItemDefinition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String effectivePeriod = "effectivePeriod";
	java.lang.String code = "code";
	java.lang.String instance = "instance";
	java.lang.String applicability = "applicability";
	java.lang.String propertyGroup = "propertyGroup";

	@Description("A formal identifier that is used to identify this charge item definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate charge item definition instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the charge item definition is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The period during which the charge item definition content was or is planned to be in active use.")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("The defined billing details in this resource pertain to the given billing code.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The defined billing details in this resource pertain to the given product instance(s).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getInstance();
	void setInstance(java.util.List<com.braintribe.model.generic.GenericEntity> instance);

	@Description("Expressions that describe applicability criteria for the billing code.")
	
	java.util.List<fhir.ChargeItemDefinitionApplicability> getApplicability();
	void setApplicability(java.util.List<fhir.ChargeItemDefinitionApplicability> applicability);

	@Description("Group of properties which are applicable under the same conditions. If no applicability rules are established for the group, then all properties always apply.")
	
	java.util.List<fhir.ChargeItemDefinitionPropertyGroup> getPropertyGroup();
	void setPropertyGroup(java.util.List<fhir.ChargeItemDefinitionPropertyGroup> propertyGroup);

}
