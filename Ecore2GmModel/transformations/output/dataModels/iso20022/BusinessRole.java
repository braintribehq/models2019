/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessRole of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link businessRoleTrace}, 
{@link businessProcess}, 

* It provides of then following operations (getters and setters)
{@link getBusinessRoleTrace},
{@link getBusinessProcess},
{@link setBusinessRoleTrace},
{@link setBusinessProcess},
 */

@Description("Functional role played by a business actor in a particular BusinessProcess or BusinessTransaction.")

public interface BusinessRole extends GenericEntity, iso20022.RepositoryConcept {

	EntityType<BusinessRole> T = EntityTypes.T(BusinessRole.class);

	/* Constants for each property name. */
	java.lang.String businessRoleTrace = "businessRoleTrace";
	java.lang.String businessProcess = "businessProcess";

	@Description("the BusinessRoleTrace for a BusinessRole")
	
	java.util.List<iso20022.Participant> getBusinessRoleTrace();
	void setBusinessRoleTrace(java.util.List<iso20022.Participant> businessRoleTrace);

	@Description("the BusinessProcess that owns the BusinessRole")
	@Mandatory
	iso20022.BusinessProcess getBusinessProcess();
	void setBusinessProcess(iso20022.BusinessProcess businessProcess);
}
