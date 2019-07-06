/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RiskEvidenceSynthesisRiskEstimate of the Data Model fhir.
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
{@link type}, 
{@link unitOfMeasure}, 
{@link precisionEstimate}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getUnitOfMeasure},
{@link getPrecisionEstimate},
{@link setType},
{@link setUnitOfMeasure},
{@link setPrecisionEstimate},
 */

@Description("The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.")

public interface RiskEvidenceSynthesisRiskEstimate extends GenericEntity, fhir.BackboneElement {

	EntityType<RiskEvidenceSynthesisRiskEstimate> T = EntityTypes.T(RiskEvidenceSynthesisRiskEstimate.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String unitOfMeasure = "unitOfMeasure";
	java.lang.String precisionEstimate = "precisionEstimate";

	@Description("Examples include proportion and mean.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Specifies the UCUM unit for the outcome.")
	@Mandatory
	fhir.CodeableConcept getUnitOfMeasure();
	void setUnitOfMeasure(fhir.CodeableConcept unitOfMeasure);
	@Description("A description of the precision of the estimate for the effect.")
	
	java.util.List<fhir.RiskEvidenceSynthesisPrecisionEstimate> getPrecisionEstimate();
	void setPrecisionEstimate(java.util.List<fhir.RiskEvidenceSynthesisPrecisionEstimate> precisionEstimate);

}
