package io.swagger.v3.oas.annotations

import br.com.undersea.data.vo.PersonVO
import io.swagger.v3.oas.annotations.extensions.Extension
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.servers.Server
import java.lang.annotation.Inherited
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.ANNOTATION_CLASS
)
@Retention(
    RetentionPolicy.RUNTIME
)
@Inherited
annotation class PeopleGetAll(
    val method: String = "",
    val tags: Array<String> = ["People"],
    val summary: String = "Finds all People",
    val description: String = "Finds all People",
    //val requestBody: RequestBody = RequestBody,
    //val externalDocs: ExternalDocumentation = ExternalDocumentation,
    val operationId: String = "",
    val parameters: Array<Parameter> = [],
    val responses: Array<ApiResponse> = [
        ApiResponse(
            description = "Success",
            responseCode = "200",
            content = [
                Content(array = ArraySchema(schema = Schema(implementation = PersonVO::class)))
            ]
        ),
        ApiResponse(
            description = "No Content", responseCode = "204", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]
        ),
        ApiResponse(
            description = "Bad Request", responseCode = "400", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]
        ),
        ApiResponse(
            description = "Unauthorized", responseCode = "401", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]
        ),
        ApiResponse(
            description = "Not Found", responseCode = "404", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]
        ),
        ApiResponse(
            description = "Internal Error", responseCode = "500", content = [
                Content(schema = Schema(implementation = Unit::class))
            ]
        ),
    ],
    val deprecated: Boolean = false,
    val security: Array<SecurityRequirement> = [],
    val servers: Array<Server> = [],
    val extensions: Array<Extension> = [],
    val hidden: Boolean = false,
    val ignoreJsonView: Boolean = false
)