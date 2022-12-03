package com.tw.ideafoundation.data

import com.google.gson.annotations.SerializedName

data class UserProjectsItem(@SerializedName("submittal_on_off")
                            val submittalOnOff: Int = 0,
                            @SerializedName("document_controllers")
                            val documentControllers: String = "",
                            @SerializedName("server_address")
                            val serverAddress: String = "",
                            @SerializedName("type")
                            val type: String = "",
                            @SerializedName("plant_manager")
                            val plantManager: String = "",
                            @SerializedName("project_order_no")
                            val projectOrderNo: String = "",
                            @SerializedName("password")
                            val password: String = "",
                            @SerializedName("project_id")
                            val projectId: String = "",
                            @SerializedName("contact")
                            val contact: String = "",
                            @SerializedName("drawing_revision_sequence_button")
                            val drawingRevisionSequenceButton: Int = 0,
                            @SerializedName("lat")
                            val lat: String = "",
                            @SerializedName("c_manager")
                            val cManager: String = "",
                            @SerializedName("color_code")
                            val colorCode: String = "",
                            @SerializedName("zip")
                            val zip: String = "",
                            @SerializedName("collection_uid")
                            val collectionUid: Int = 0,
                            @SerializedName("image")
                            val image: String = "",
                            @SerializedName("retention_date")
                            val retentionDate: String = "",
                            @SerializedName("submittal_days_warning")
                            val submittalDaysWarning: String = "",
                            @SerializedName("retention_notify_days")
                            val retentionNotifyDays: Int = 0,
                            @SerializedName("archive")
                            val archive: Int = 0,
                            @SerializedName("showfor_mobile_siteaccess")
                            val showforMobileSiteaccess: String = "",
                            @SerializedName("db_importor_status")
                            val dbImportorStatus: Int = 0,
                            @SerializedName("submittal_status_graph")
                            val submittalStatusGraph: Int = 0,
                            @SerializedName("submittal_days_warning_button")
                            val submittalDaysWarningButton: Int = 0,
                            @SerializedName("hidden_status")
                            val hiddenStatus: Int = 0,
                            @SerializedName("region")
                            val region: String = "",
                            @SerializedName("status")
                            val status: String = "",
                            @SerializedName("end_date")
                            val endDate: String = "",
                            @SerializedName("note")
                            val note: String = "",
                            @SerializedName("description")
                            val description: String = "",
                            @SerializedName("project_cost")
                            val projectCost: String = "",
                            @SerializedName("drawing_revision_sequence")
                            val drawingRevisionSequence: String = "",
                            @SerializedName("title")
                            val title: String = "",
                            @SerializedName("logistics_manager")
                            val logisticsManager: String = "",
                            @SerializedName("projectHours")
                            val projectHours: ProjectHours,
                            @SerializedName("super_admin_project")
                            val superAdminProject: Int = 0,
                            @SerializedName("project_primaryEmail")
                            val projectPrimaryEmail: String = "",
                            @SerializedName("uid")
                            val uid: Int = 0,
                            @SerializedName("added_by")
                            val addedBy: Int = 0,
                            @SerializedName("delete_status")
                            val deleteStatus: Int = 0,
                            @SerializedName("client")
                            val client: Int = 0,
                            @SerializedName("submittal_revision_sequence_button")
                            val submittalRevisionSequenceButton: Int = 0,
                            @SerializedName("submittals_upload_project_document")
                            val submittalsUploadProjectDocument: String = "",
                            @SerializedName("noOfMilestonesToShow")
                            val noOfMilestonesToShow: Int = 0,
                            @SerializedName("cost_track_labour")
                            val costTrackLabour: Boolean = false,
                            @SerializedName("lang")
                            val lang: String = "",
                            @SerializedName("added_on")
                            val addedOn: String = "",
                            @SerializedName("headline")
                            val headline: String = "",
                            @SerializedName("submittal_revision_sequence")
                            val submittalRevisionSequence: String = "",
                            @SerializedName("address")
                            val address: String = "",
                            @SerializedName("proj_doc_flow_manager")
                            val projDocFlowManager: String = "",
                            @SerializedName("stage")
                            val stage: String = "",
                            @SerializedName("submittals_upload_project_drawing")
                            val submittalsUploadProjectDrawing: String = "",
                            @SerializedName("group_id_system")
                            val groupIdSystem: Int = 0,
                            @SerializedName("project_order")
                            val projectOrder: Int = 0,
                            @SerializedName("username")
                            val username: String = "")