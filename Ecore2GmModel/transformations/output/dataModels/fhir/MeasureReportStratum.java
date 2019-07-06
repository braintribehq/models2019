/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureReportStratum of the Data Model fhir.
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
{@link value}, 
{@link component}, 
{@link population}, 
{@link measureScore}, 

* It provides of then following operations (getters and setters)
{@link getValue},
{@link getComponent},
{@link getPopulation},
{@link getMeasureScore},
{@link setValue},
{@link setComponent},
{@link setPopulation},
{@link setMeasureScore},
 */

@Description("The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.")

public interface MeasureReportStratum extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasureReportStratum> T = EntityTypes.T(MeasureReportStratum.class);

	/* Constants for each property name. */
	java.lang.String value = "value";
	java.lang.String component = "component";
	java.lang.String population = "population";
	java.lang.String measureScore = "measureScore";

	@Description("The value for this stratum, expressed as a CodeableConcept. When defining stratifiers on complex values, the value must be rendered such that the value for each stratum within the stratifier is unique.")
	@Mandatory
	fhir.CodeableConcept getValue();
	void setValue(fhir.CodeableConcept value);
	@Description("A stratifier component value.")
	
	java.util.List<fhir.MeasureReportComponent> getComponent();
	void setComponent(java.util.List<fhir.MeasureReportComponent> component);

	@Description("The populations that make up the stratum, one for each type of population appropriate to the measure.")
	
	java.util.List<fhir.MeasureReportPopulation1> getPopulation();
	void setPopulation(java.util.List<fhir.MeasureReportPopulation1> population);

	@Description("The measure score for this stratum, calculated as appropriate for the measure type and scoring method, and based on only the members of this stratum.")
	@Mandatory
	fhir.Quantity getMeasureScore();
	void setMeasureScore(fhir.Quantity measureScore);
}
