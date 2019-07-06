/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureReport of the Data Model fhir.
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
{@link subject}, 
{@link reporter}, 
{@link period}, 
{@link improvementNotation}, 
{@link group}, 
{@link evaluatedResource}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getSubject},
{@link getReporter},
{@link getPeriod},
{@link getImprovementNotation},
{@link getGroup},
{@link getEvaluatedResource},
{@link setIdentifier},
{@link setSubject},
{@link setReporter},
{@link setPeriod},
{@link setImprovementNotation},
{@link setGroup},
{@link setEvaluatedResource},
 */

@Description("The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.If the element is present, it must have either a @value, an @id, or extensions")

public interface MeasureReport extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MeasureReport> T = EntityTypes.T(MeasureReport.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String subject = "subject";
	java.lang.String reporter = "reporter";
	java.lang.String period = "period";
	java.lang.String improvementNotation = "improvementNotation";
	java.lang.String group = "group";
	java.lang.String evaluatedResource = "evaluatedResource";

	@Description("A formal identifier that is used to identify this MeasureReport when it is represented in other formats or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Optional subject identifying the individual or individuals the report is for.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The individual, location, or organization that is reporting the data.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReporter();
	void setReporter(com.braintribe.model.generic.GenericEntity reporter);
	@Description("The reporting period for which the report was calculated.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Whether improvement in the measure is noted by an increase or decrease in the measure score.")
	@Mandatory
	fhir.CodeableConcept getImprovementNotation();
	void setImprovementNotation(fhir.CodeableConcept improvementNotation);
	@Description("The results of the calculation, one for each population group in the measure.")
	
	java.util.List<fhir.MeasureReportGroup> getGroup();
	void setGroup(java.util.List<fhir.MeasureReportGroup> group);

	@Description("A reference to a Bundle containing the Resources that were used in the calculation of this measure.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEvaluatedResource();
	void setEvaluatedResource(java.util.List<com.braintribe.model.generic.GenericEntity> evaluatedResource);

}
