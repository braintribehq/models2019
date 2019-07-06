/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessProcess of the Data Model iso20022.
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
{@link extender}, 
{@link extended}, 
{@link included}, 
{@link includer}, 
{@link businessRole}, 
{@link businessProcessTrace}, 

* It provides of then following operations (getters and setters)
{@link getExtender},
{@link getExtended},
{@link getIncluded},
{@link getIncluder},
{@link getBusinessRole},
{@link getBusinessProcessTrace},
{@link setExtender},
{@link setExtended},
{@link setIncluded},
{@link setIncluder},
{@link setBusinessRole},
{@link setBusinessProcessTrace},
 */

@Description("unrealized definition of the business activities undertaken by BusinessRoles within a BusinessArea whereby each BusinessProcess fulfils one type of business activity and whereby a BusinessProcess may include and extend other BusinessProcesses")

public interface BusinessProcess extends GenericEntity, iso20022.TopLevelCatalogueEntry {

	EntityType<BusinessProcess> T = EntityTypes.T(BusinessProcess.class);

	/* Constants for each property name. */
	java.lang.String extender = "extender";
	java.lang.String extended = "extended";
	java.lang.String included = "included";
	java.lang.String includer = "includer";
	java.lang.String businessRole = "businessRole";
	java.lang.String businessProcessTrace = "businessProcessTrace";

	@Description("specifies the BusinessProcess that is extending another BusinessProcess")
	
	java.util.List<iso20022.BusinessProcess> getExtender();
	void setExtender(java.util.List<iso20022.BusinessProcess> extender);

	@Description("specifies the BusinessProcess that is extended by another BusinessProcess")
	
	java.util.List<iso20022.BusinessProcess> getExtended();
	void setExtended(java.util.List<iso20022.BusinessProcess> extended);

	@Description("specifies the BusinessProcess that is included by another BusinessProcess")
	
	java.util.List<iso20022.BusinessProcess> getIncluded();
	void setIncluded(java.util.List<iso20022.BusinessProcess> included);

	@Description("specifies the BusinessProcess that is incuding another BusinessProcess")
	
	java.util.List<iso20022.BusinessProcess> getIncluder();
	void setIncluder(java.util.List<iso20022.BusinessProcess> includer);

	@Description("the BusinessRole that plays a role in BusinessProcess that owns it.")
	
	java.util.List<iso20022.BusinessRole> getBusinessRole();
	void setBusinessRole(java.util.List<iso20022.BusinessRole> businessRole);

	@Description("")
	
	java.util.List<iso20022.BusinessTransaction> getBusinessProcessTrace();
	void setBusinessProcessTrace(java.util.List<iso20022.BusinessTransaction> businessProcessTrace);

}
