/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTask of the Data Model iai.
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
{@link Status}, 
{@link WorkMethod}, 
{@link IsMilestone}, 
{@link Priority}, 
{@link TaskTime}, 
{@link PredefinedType}, 

* It provides of then following operations (getters and setters)
{@link getStatus},
{@link getWorkMethod},
{@link getIsMilestone},
{@link getPriority},
{@link getTaskTime},
{@link getPredefinedType},
{@link setStatus},
{@link setWorkMethod},
{@link setIsMilestone},
{@link setPriority},
{@link setTaskTime},
{@link setPredefinedType},
 */

@Description("")

public interface IfcTask extends GenericEntity, ifc4.IfcProcess {

	EntityType<IfcTask> T = EntityTypes.T(IfcTask.class);

	/* Constants for each property name. */
	java.lang.String Status = "Status";
	java.lang.String WorkMethod = "WorkMethod";
	java.lang.String IsMilestone = "IsMilestone";
	java.lang.String Priority = "Priority";
	java.lang.String TaskTime = "TaskTime";
	java.lang.String PredefinedType = "PredefinedType";

	@Description("")
	@Mandatory
	java.lang.String getStatus();
	void setStatus(java.lang.String Status);
	@Description("")
	@Mandatory
	java.lang.String getWorkMethod();
	void setWorkMethod(java.lang.String WorkMethod);
	@Description("")
	@Mandatory
	ifc4.Tristate getIsMilestone();
	void setIsMilestone(ifc4.Tristate IsMilestone);
	@Description("")
	@Mandatory
	java.lang.Long getPriority();
	void setPriority(java.lang.Long Priority);
	@Description("")
	@Mandatory
	ifc4.IfcTaskTime getTaskTime();
	void setTaskTime(ifc4.IfcTaskTime TaskTime);
	@Description("")
	@Mandatory
	ifc4.IfcTaskTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcTaskTypeEnum PredefinedType);
}
