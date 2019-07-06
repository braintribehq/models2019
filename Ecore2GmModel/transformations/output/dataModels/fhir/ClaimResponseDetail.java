/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimResponseDetail of the Data Model fhir.
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
{@link subDetail}, 

* It provides of then following operations (getters and setters)
{@link getAdjudication},
{@link getSubDetail},
{@link setAdjudication},
{@link setSubDetail},
 */

@Description("This resource provides the adjudication details from the processing of a Claim resource.")

public interface ClaimResponseDetail extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimResponseDetail> T = EntityTypes.T(ClaimResponseDetail.class);

	/* Constants for each property name. */
	java.lang.String adjudication = "adjudication";
	java.lang.String subDetail = "subDetail";

	@Description("The adjudication results.")
	
	java.util.List<fhir.ClaimResponseAdjudication> getAdjudication();
	void setAdjudication(java.util.List<fhir.ClaimResponseAdjudication> adjudication);

	@Description("A sub-detail adjudication of a simple product or service.")
	
	java.util.List<fhir.ClaimResponseSubDetail> getSubDetail();
	void setSubDetail(java.util.List<fhir.ClaimResponseSubDetail> subDetail);

}
