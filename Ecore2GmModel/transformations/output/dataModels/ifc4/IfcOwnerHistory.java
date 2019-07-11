/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcOwnerHistory of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link OwningUser}, 
{@link OwningApplication}, 
{@link State}, 
{@link ChangeAction}, 
{@link LastModifiedDate}, 
{@link LastModifyingUser}, 
{@link LastModifyingApplication}, 
{@link CreationDate}, 

* It provides of then following operations (getters and setters)
{@link getOwningUser},
{@link getOwningApplication},
{@link getState},
{@link getChangeAction},
{@link getLastModifiedDate},
{@link getLastModifyingUser},
{@link getLastModifyingApplication},
{@link getCreationDate},
{@link setOwningUser},
{@link setOwningApplication},
{@link setState},
{@link setChangeAction},
{@link setLastModifiedDate},
{@link setLastModifyingUser},
{@link setLastModifyingApplication},
{@link setCreationDate},
 */

@Description("")

public interface IfcOwnerHistory extends GenericEntity {

	EntityType<IfcOwnerHistory> T = EntityTypes.T(IfcOwnerHistory.class);

	/* Constants for each property name. */
	java.lang.String OwningUser = "OwningUser";
	java.lang.String OwningApplication = "OwningApplication";
	java.lang.String State = "State";
	java.lang.String ChangeAction = "ChangeAction";
	java.lang.String LastModifiedDate = "LastModifiedDate";
	java.lang.String LastModifyingUser = "LastModifyingUser";
	java.lang.String LastModifyingApplication = "LastModifyingApplication";
	java.lang.String CreationDate = "CreationDate";

	@Description("")
	@Mandatory
	ifc4.IfcPersonAndOrganization getOwningUser();
	void setOwningUser(ifc4.IfcPersonAndOrganization OwningUser);
	@Description("")
	@Mandatory
	ifc4.IfcApplication getOwningApplication();
	void setOwningApplication(ifc4.IfcApplication OwningApplication);
	@Description("")
	@Mandatory
	ifc4.IfcStateEnum getState();
	void setState(ifc4.IfcStateEnum State);
	@Description("")
	@Mandatory
	ifc4.IfcChangeActionEnum getChangeAction();
	void setChangeAction(ifc4.IfcChangeActionEnum ChangeAction);
	@Description("")
	@Mandatory
	java.lang.Long getLastModifiedDate();
	void setLastModifiedDate(java.lang.Long LastModifiedDate);
	@Description("")
	@Mandatory
	ifc4.IfcPersonAndOrganization getLastModifyingUser();
	void setLastModifyingUser(ifc4.IfcPersonAndOrganization LastModifyingUser);
	@Description("")
	@Mandatory
	ifc4.IfcApplication getLastModifyingApplication();
	void setLastModifyingApplication(ifc4.IfcApplication LastModifyingApplication);
	@Description("")
	@Mandatory
	java.lang.Long getCreationDate();
	void setCreationDate(java.lang.Long CreationDate);
}
