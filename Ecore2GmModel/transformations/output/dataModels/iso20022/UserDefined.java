/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type UserDefined of the Data Model iso20022.
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
{@link namespace}, 
{@link namespaceList}, 
{@link processContents}, 

* It provides of then following operations (getters and setters)
{@link getNamespace},
{@link getNamespaceList},
{@link getProcessContents},
{@link setNamespace},
{@link setNamespaceList},
{@link setProcessContents},
 */

@Description("A Type which allows referring to a structure defined outside of the ISO20022 MessageDefinition.")

public interface UserDefined extends GenericEntity, iso20022.MessageComponentType {

	EntityType<UserDefined> T = EntityTypes.T(UserDefined.class);

	/* Constants for each property name. */
	java.lang.String namespace = "namespace";
	java.lang.String namespaceList = "namespaceList";
	java.lang.String processContents = "processContents";

	@Description("The URN namespace of the referenced external structure definition. The allowed values are: ##any, ##other or list. When equal to 'list', then the value of the property 'namespaceList' must be filled.")
	@Mandatory
	iso20022.Namespace getNamespace();
	void setNamespace(iso20022.Namespace namespace);
	@Description("A list of URN namespaces.")
	@Mandatory
	java.lang.String getNamespaceList();
	void setNamespaceList(java.lang.String namespaceList);
	@Description("Indicates the kind of validation which must be performed on the external structure.")
	@Mandatory
	iso20022.ProcessContent getProcessContents();
	void setProcessContents(iso20022.ProcessContent processContents);
}
