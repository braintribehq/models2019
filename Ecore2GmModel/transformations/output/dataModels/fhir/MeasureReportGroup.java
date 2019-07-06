/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureReportGroup of the Data Model fhir.
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
{@link population}, 
{@link measureScore}, 
{@link stratifier}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getPopulation},
{@link getMeasureScore},
{@link getStratifier},
{@link setCode},
{@link setPopulation},
{@link setMeasureScore},
{@link setStratifier},
 */

@Description("The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.")

public interface MeasureReportGroup extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasureReportGroup> T = EntityTypes.T(MeasureReportGroup.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String population = "population";
	java.lang.String measureScore = "measureScore";
	java.lang.String stratifier = "stratifier";

	@Description("The meaning of the population group as defined in the measure definition.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The populations that make up the population group, one for each type of population appropriate for the measure.")
	
	java.util.List<fhir.MeasureReportPopulation> getPopulation();
	void setPopulation(java.util.List<fhir.MeasureReportPopulation> population);

	@Description("The measure score for this population group, calculated as appropriate for the measure type and scoring method, and based on the contents of the populations defined in the group.")
	@Mandatory
	fhir.Quantity getMeasureScore();
	void setMeasureScore(fhir.Quantity measureScore);
	@Description("When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier defined by the measure.")
	
	java.util.List<fhir.MeasureReportStratifier> getStratifier();
	void setStratifier(java.util.List<fhir.MeasureReportStratifier> stratifier);

}
