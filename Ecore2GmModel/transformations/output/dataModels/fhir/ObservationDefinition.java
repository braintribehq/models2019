/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ObservationDefinition of the Data Model fhir.
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
{@link category}, 
{@link code}, 
{@link identifier}, 
{@link method}, 
{@link quantitativeDetails}, 
{@link qualifiedInterval}, 
{@link validCodedValueSet}, 
{@link normalCodedValueSet}, 
{@link abnormalCodedValueSet}, 
{@link criticalCodedValueSet}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getCode},
{@link getIdentifier},
{@link getMethod},
{@link getQuantitativeDetails},
{@link getQualifiedInterval},
{@link getValidCodedValueSet},
{@link getNormalCodedValueSet},
{@link getAbnormalCodedValueSet},
{@link getCriticalCodedValueSet},
{@link setCategory},
{@link setCode},
{@link setIdentifier},
{@link setMethod},
{@link setQuantitativeDetails},
{@link setQualifiedInterval},
{@link setValidCodedValueSet},
{@link setNormalCodedValueSet},
{@link setAbnormalCodedValueSet},
{@link setCriticalCodedValueSet},
 */

@Description("Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.If the element is present, it must have either a @value, an @id, or extensions")

public interface ObservationDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ObservationDefinition> T = EntityTypes.T(ObservationDefinition.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String identifier = "identifier";
	java.lang.String method = "method";
	java.lang.String quantitativeDetails = "quantitativeDetails";
	java.lang.String qualifiedInterval = "qualifiedInterval";
	java.lang.String validCodedValueSet = "validCodedValueSet";
	java.lang.String normalCodedValueSet = "normalCodedValueSet";
	java.lang.String abnormalCodedValueSet = "abnormalCodedValueSet";
	java.lang.String criticalCodedValueSet = "criticalCodedValueSet";

	@Description("A code that classifies the general type of observation.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("Describes what will be observed. Sometimes this is called the observation 'name'.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("A unique identifier assigned to this ObservationDefinition artifact.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The method or technique used to perform the observation.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
	@Description("Characteristics for quantitative results of this observation.")
	@Mandatory
	fhir.ObservationDefinitionQuantitativeDetails getQuantitativeDetails();
	void setQuantitativeDetails(fhir.ObservationDefinitionQuantitativeDetails quantitativeDetails);
	@Description("Multiple  ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.")
	
	java.util.List<fhir.ObservationDefinitionQualifiedInterval> getQualifiedInterval();
	void setQualifiedInterval(java.util.List<fhir.ObservationDefinitionQualifiedInterval> qualifiedInterval);

	@Description("The set of valid coded results for the observations  conforming to this ObservationDefinition.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getValidCodedValueSet();
	void setValidCodedValueSet(com.braintribe.model.generic.GenericEntity validCodedValueSet);
	@Description("The set of normal coded results for the observations conforming to this ObservationDefinition.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getNormalCodedValueSet();
	void setNormalCodedValueSet(com.braintribe.model.generic.GenericEntity normalCodedValueSet);
	@Description("The set of abnormal coded results for the observation conforming to this ObservationDefinition.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAbnormalCodedValueSet();
	void setAbnormalCodedValueSet(com.braintribe.model.generic.GenericEntity abnormalCodedValueSet);
	@Description("The set of critical coded results for the observation conforming to this ObservationDefinition.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCriticalCodedValueSet();
	void setCriticalCodedValueSet(com.braintribe.model.generic.GenericEntity criticalCodedValueSet);
}
