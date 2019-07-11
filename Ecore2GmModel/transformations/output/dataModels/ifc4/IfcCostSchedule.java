/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCostSchedule of the Data Model iai.
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
{@link PredefinedType}, 
{@link Status}, 
{@link SubmittedOn}, 
{@link UpdateDate}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getStatus},
{@link getSubmittedOn},
{@link getUpdateDate},
{@link setPredefinedType},
{@link setStatus},
{@link setSubmittedOn},
{@link setUpdateDate},
 */

@Description("")

public interface IfcCostSchedule extends GenericEntity, ifc4.IfcControl {

	EntityType<IfcCostSchedule> T = EntityTypes.T(IfcCostSchedule.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String Status = "Status";
	java.lang.String SubmittedOn = "SubmittedOn";
	java.lang.String UpdateDate = "UpdateDate";

	@Description("")
	@Mandatory
	ifc4.IfcCostScheduleTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcCostScheduleTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.lang.String getStatus();
	void setStatus(java.lang.String Status);
	@Description("")
	@Mandatory
	java.lang.String getSubmittedOn();
	void setSubmittedOn(java.lang.String SubmittedOn);
	@Description("")
	@Mandatory
	java.lang.String getUpdateDate();
	void setUpdateDate(java.lang.String UpdateDate);
}
