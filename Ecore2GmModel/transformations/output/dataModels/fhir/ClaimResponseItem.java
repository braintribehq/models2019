/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimResponseItem of the Data Model fhir.
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
{@link adjudication}, 
{@link detail}, 

* It provides of then following operations (getters and setters)
{@link getAdjudication},
{@link getDetail},
{@link setAdjudication},
{@link setDetail},
 */

@Description("This resource provides the adjudication details from the processing of a Claim resource.")

public interface ClaimResponseItem extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimResponseItem> T = EntityTypes.T(ClaimResponseItem.class);

	/* Constants for each property name. */
	java.lang.String adjudication = "adjudication";
	java.lang.String detail = "detail";

	@Description("If this item is a group then the values here are a summary of the adjudication of the detail items. If this item is a simple product or service then this is the result of the adjudication of this item.")
	
	java.util.List<fhir.ClaimResponseAdjudication> getAdjudication();
	void setAdjudication(java.util.List<fhir.ClaimResponseAdjudication> adjudication);

	@Description("A claim detail. Either a simple (a product or service) or a 'group' of sub-details which are simple items.")
	
	java.util.List<fhir.ClaimResponseDetail> getDetail();
	void setDetail(java.util.List<fhir.ClaimResponseDetail> detail);

}
