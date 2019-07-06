/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NutritionOrderAdministration of the Data Model fhir.
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
{@link schedule}, 
{@link quantity}, 
{@link rateQuantity}, 
{@link rateRatio}, 

* It provides of then following operations (getters and setters)
{@link getSchedule},
{@link getQuantity},
{@link getRateQuantity},
{@link getRateRatio},
{@link setSchedule},
{@link setQuantity},
{@link setRateQuantity},
{@link setRateRatio},
 */

@Description("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")

public interface NutritionOrderAdministration extends GenericEntity, fhir.BackboneElement {

	EntityType<NutritionOrderAdministration> T = EntityTypes.T(NutritionOrderAdministration.class);

	/* Constants for each property name. */
	java.lang.String schedule = "schedule";
	java.lang.String quantity = "quantity";
	java.lang.String rateQuantity = "rateQuantity";
	java.lang.String rateRatio = "rateRatio";

	@Description("The time period and frequency at which the enteral formula should be delivered to the patient.")
	@Mandatory
	fhir.Timing getSchedule();
	void setSchedule(fhir.Timing schedule);
	@Description("The volume of formula to provide to the patient per the specified administration schedule.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("")
	@Mandatory
	fhir.Quantity getRateQuantity();
	void setRateQuantity(fhir.Quantity rateQuantity);
	@Description("")
	@Mandatory
	fhir.Ratio getRateRatio();
	void setRateRatio(fhir.Ratio rateRatio);
}
