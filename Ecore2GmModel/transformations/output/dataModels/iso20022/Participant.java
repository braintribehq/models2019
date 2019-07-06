/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Participant of the Data Model iso20022.
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
{@link businessTransaction}, 
{@link receives}, 
{@link sends}, 
{@link businessRoleTrace}, 

* It provides of then following operations (getters and setters)
{@link getBusinessTransaction},
{@link getReceives},
{@link getSends},
{@link getBusinessRoleTrace},
{@link setBusinessTransaction},
{@link setReceives},
{@link setSends},
{@link setBusinessRoleTrace},
 */

@Description("involvement of a BusinessRole in a BusinessTransaction")

public interface Participant extends GenericEntity, iso20022.RepositoryConcept, iso20022.MultiplicityEntity {

	EntityType<Participant> T = EntityTypes.T(Participant.class);

	/* Constants for each property name. */
	java.lang.String businessTransaction = "businessTransaction";
	java.lang.String receives = "receives";
	java.lang.String sends = "sends";
	java.lang.String businessRoleTrace = "businessRoleTrace";

	@Description("the BusinessTransaction in which the Participant plays a role")
	@Mandatory
	iso20022.BusinessTransaction getBusinessTransaction();
	void setBusinessTransaction(iso20022.BusinessTransaction businessTransaction);
	@Description("The handling of a stimulus passed from a sending participant")
	
	java.util.List<iso20022.Receive> getReceives();
	void setReceives(java.util.List<iso20022.Receive> receives);

	@Description("The passing of information from a sending Participant to a receiving Participant")
	
	java.util.List<iso20022.Send> getSends();
	void setSends(java.util.List<iso20022.Send> sends);

	@Description("the BusinessRoleTrace that traces the Participant to its BusinessRole")
	@Mandatory
	iso20022.BusinessRole getBusinessRoleTrace();
	void setBusinessRoleTrace(iso20022.BusinessRole businessRoleTrace);
}
