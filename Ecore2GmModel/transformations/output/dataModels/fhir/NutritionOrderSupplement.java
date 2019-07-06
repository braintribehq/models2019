/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NutritionOrderSupplement of the Data Model fhir.
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
{@link schedule}, 
{@link quantity}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getSchedule},
{@link getQuantity},
{@link setType},
{@link setSchedule},
{@link setQuantity},
 */

@Description("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")

public interface NutritionOrderSupplement extends GenericEntity, fhir.BackboneElement {

	EntityType<NutritionOrderSupplement> T = EntityTypes.T(NutritionOrderSupplement.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String schedule = "schedule";
	java.lang.String quantity = "quantity";

	@Description("The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The time period and frequency at which the supplement(s) should be given.  The supplement should be given for the combination of all schedules if more than one schedule is present.")
	
	java.util.List<fhir.Timing> getSchedule();
	void setSchedule(java.util.List<fhir.Timing> schedule);

	@Description("The amount of the nutritional supplement to be given.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
}
