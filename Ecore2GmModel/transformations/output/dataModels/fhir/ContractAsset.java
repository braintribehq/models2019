/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractAsset of the Data Model fhir.
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
{@link scope}, 
{@link type}, 
{@link typeReference}, 
{@link subtype}, 
{@link relationship}, 
{@link context}, 
{@link periodType}, 
{@link period}, 
{@link usePeriod}, 
{@link answer}, 
{@link valuedItem}, 

* It provides of then following operations (getters and setters)
{@link getScope},
{@link getType},
{@link getTypeReference},
{@link getSubtype},
{@link getRelationship},
{@link getContext},
{@link getPeriodType},
{@link getPeriod},
{@link getUsePeriod},
{@link getAnswer},
{@link getValuedItem},
{@link setScope},
{@link setType},
{@link setTypeReference},
{@link setSubtype},
{@link setRelationship},
{@link setContext},
{@link setPeriodType},
{@link setPeriod},
{@link setUsePeriod},
{@link setAnswer},
{@link setValuedItem},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractAsset extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractAsset> T = EntityTypes.T(ContractAsset.class);

	/* Constants for each property name. */
	java.lang.String scope = "scope";
	java.lang.String type = "type";
	java.lang.String typeReference = "typeReference";
	java.lang.String subtype = "subtype";
	java.lang.String relationship = "relationship";
	java.lang.String context = "context";
	java.lang.String periodType = "periodType";
	java.lang.String period = "period";
	java.lang.String usePeriod = "usePeriod";
	java.lang.String answer = "answer";
	java.lang.String valuedItem = "valuedItem";

	@Description("Differentiates the kind of the asset .")
	@Mandatory
	fhir.CodeableConcept getScope();
	void setScope(fhir.CodeableConcept scope);
	@Description("Target entity type about which the term may be concerned.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("Associated entities.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getTypeReference();
	void setTypeReference(java.util.List<com.braintribe.model.generic.GenericEntity> typeReference);

	@Description("May be a subtype or part of an offered asset.")
	
	java.util.List<fhir.CodeableConcept> getSubtype();
	void setSubtype(java.util.List<fhir.CodeableConcept> subtype);

	@Description("Specifies the applicability of the term to an asset resource instance, and instances it refers to orinstances that refer to it, and/or are owned by the offeree.")
	@Mandatory
	fhir.Coding getRelationship();
	void setRelationship(fhir.Coding relationship);
	@Description("Circumstance of the asset.")
	
	java.util.List<fhir.ContractContext> getContext();
	void setContext(java.util.List<fhir.ContractContext> context);

	@Description("Type of Asset availability for use or ownership.")
	
	java.util.List<fhir.CodeableConcept> getPeriodType();
	void setPeriodType(java.util.List<fhir.CodeableConcept> periodType);

	@Description("Asset relevant contractual time period.")
	
	java.util.List<fhir.Period> getPeriod();
	void setPeriod(java.util.List<fhir.Period> period);

	@Description("Time period of asset use.")
	
	java.util.List<fhir.Period> getUsePeriod();
	void setUsePeriod(java.util.List<fhir.Period> usePeriod);

	@Description("Response to assets.")
	
	java.util.List<fhir.ContractAnswer> getAnswer();
	void setAnswer(java.util.List<fhir.ContractAnswer> answer);

	@Description("Contract Valued Item List.")
	
	java.util.List<fhir.ContractValuedItem> getValuedItem();
	void setValuedItem(java.util.List<fhir.ContractValuedItem> valuedItem);

}
