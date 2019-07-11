/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTaskTime of the Data Model iai.
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
{@link DurationType}, 
{@link ScheduleDuration}, 
{@link ScheduleStart}, 
{@link ScheduleFinish}, 
{@link EarlyStart}, 
{@link EarlyFinish}, 
{@link LateStart}, 
{@link LateFinish}, 
{@link FreeFloat}, 
{@link TotalFloat}, 
{@link IsCritical}, 
{@link StatusTime}, 
{@link ActualDuration}, 
{@link ActualStart}, 
{@link ActualFinish}, 
{@link RemainingTime}, 
{@link Completion}, 
{@link CompletionAsString}, 

* It provides of then following operations (getters and setters)
{@link getDurationType},
{@link getScheduleDuration},
{@link getScheduleStart},
{@link getScheduleFinish},
{@link getEarlyStart},
{@link getEarlyFinish},
{@link getLateStart},
{@link getLateFinish},
{@link getFreeFloat},
{@link getTotalFloat},
{@link getIsCritical},
{@link getStatusTime},
{@link getActualDuration},
{@link getActualStart},
{@link getActualFinish},
{@link getRemainingTime},
{@link getCompletion},
{@link getCompletionAsString},
{@link setDurationType},
{@link setScheduleDuration},
{@link setScheduleStart},
{@link setScheduleFinish},
{@link setEarlyStart},
{@link setEarlyFinish},
{@link setLateStart},
{@link setLateFinish},
{@link setFreeFloat},
{@link setTotalFloat},
{@link setIsCritical},
{@link setStatusTime},
{@link setActualDuration},
{@link setActualStart},
{@link setActualFinish},
{@link setRemainingTime},
{@link setCompletion},
{@link setCompletionAsString},
 */

@Description("")

public interface IfcTaskTime extends GenericEntity, ifc4.IfcSchedulingTime {

	EntityType<IfcTaskTime> T = EntityTypes.T(IfcTaskTime.class);

	/* Constants for each property name. */
	java.lang.String DurationType = "DurationType";
	java.lang.String ScheduleDuration = "ScheduleDuration";
	java.lang.String ScheduleStart = "ScheduleStart";
	java.lang.String ScheduleFinish = "ScheduleFinish";
	java.lang.String EarlyStart = "EarlyStart";
	java.lang.String EarlyFinish = "EarlyFinish";
	java.lang.String LateStart = "LateStart";
	java.lang.String LateFinish = "LateFinish";
	java.lang.String FreeFloat = "FreeFloat";
	java.lang.String TotalFloat = "TotalFloat";
	java.lang.String IsCritical = "IsCritical";
	java.lang.String StatusTime = "StatusTime";
	java.lang.String ActualDuration = "ActualDuration";
	java.lang.String ActualStart = "ActualStart";
	java.lang.String ActualFinish = "ActualFinish";
	java.lang.String RemainingTime = "RemainingTime";
	java.lang.String Completion = "Completion";
	java.lang.String CompletionAsString = "CompletionAsString";

	@Description("")
	@Mandatory
	ifc4.IfcTaskDurationEnum getDurationType();
	void setDurationType(ifc4.IfcTaskDurationEnum DurationType);
	@Description("")
	@Mandatory
	java.lang.String getScheduleDuration();
	void setScheduleDuration(java.lang.String ScheduleDuration);
	@Description("")
	@Mandatory
	java.lang.String getScheduleStart();
	void setScheduleStart(java.lang.String ScheduleStart);
	@Description("")
	@Mandatory
	java.lang.String getScheduleFinish();
	void setScheduleFinish(java.lang.String ScheduleFinish);
	@Description("")
	@Mandatory
	java.lang.String getEarlyStart();
	void setEarlyStart(java.lang.String EarlyStart);
	@Description("")
	@Mandatory
	java.lang.String getEarlyFinish();
	void setEarlyFinish(java.lang.String EarlyFinish);
	@Description("")
	@Mandatory
	java.lang.String getLateStart();
	void setLateStart(java.lang.String LateStart);
	@Description("")
	@Mandatory
	java.lang.String getLateFinish();
	void setLateFinish(java.lang.String LateFinish);
	@Description("")
	@Mandatory
	java.lang.String getFreeFloat();
	void setFreeFloat(java.lang.String FreeFloat);
	@Description("")
	@Mandatory
	java.lang.String getTotalFloat();
	void setTotalFloat(java.lang.String TotalFloat);
	@Description("")
	@Mandatory
	ifc4.Tristate getIsCritical();
	void setIsCritical(ifc4.Tristate IsCritical);
	@Description("")
	@Mandatory
	java.lang.String getStatusTime();
	void setStatusTime(java.lang.String StatusTime);
	@Description("")
	@Mandatory
	java.lang.String getActualDuration();
	void setActualDuration(java.lang.String ActualDuration);
	@Description("")
	@Mandatory
	java.lang.String getActualStart();
	void setActualStart(java.lang.String ActualStart);
	@Description("")
	@Mandatory
	java.lang.String getActualFinish();
	void setActualFinish(java.lang.String ActualFinish);
	@Description("")
	@Mandatory
	java.lang.String getRemainingTime();
	void setRemainingTime(java.lang.String RemainingTime);
	@Description("")
	@Mandatory
	java.lang.Double getCompletion();
	void setCompletion(java.lang.Double Completion);
	@Description("")
	@Mandatory
	java.lang.String getCompletionAsString();
	void setCompletionAsString(java.lang.String CompletionAsString);
}
