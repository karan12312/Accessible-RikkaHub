package me.rerere.rikkahub.data.datastore

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import me.rerere.ai.provider.ProviderSetting
import me.rerere.rikkahub.ui.components.richtext.MarkdownBlock
import kotlin.uuid.Uuid

/**
 * 推荐的提供商列表，在提供商设置页右上角的推荐 Sheet 中展示。
 */
val RECOMMENDED_PROVIDERS: List<ProviderSetting> = listOf(
    ProviderSetting.OpenAI(
        id = Uuid.parse("1b1395ed-b702-4aeb-8bc1-b681c4456953"),
        name = "AiHubMix",
        baseUrl = "https://aihubmix.com/v1",
        apiKey = "",
        enabled = true,
        description = {
            Text(
                text = buildAnnotatedString {
                    append("High-concurrency, stable service for mainstream models such as OpenAI, Claude and Google Gemini")
                    appendLine()
                    append("Website: ")
                    withLink(LinkAnnotation.Url("https://aihubmix.com?aff=pG7r")) {
                        withStyle(SpanStyle(MaterialTheme.colorScheme.primary)) {
                            append("https://aihubmix.com")
                        }
                    }
                    appendLine()
                    append("Top up: ")
                    withLink(LinkAnnotation.Url("https://console.aihubmix.com/topup")) {
                        withStyle(SpanStyle(MaterialTheme.colorScheme.primary)) {
                            append("https://console.aihubmix.com/topup")
                        }
                    }
                }
            )
        },
    ),
    ProviderSetting.OpenAI(
        id = Uuid.parse("2a05506f-3a59-450a-a493-33a82bc85a81"),
        name = "APIMart",
        baseUrl = "https://api.apimart.ai/v1",
        apiKey = "",
        enabled = true,
        description = {
            Text(
                text = buildAnnotatedString {
                    append("APIMart is a low-cost API platform focused on AI image and video generation. GPT-Image-2 costs as little as $0.006 per image, so $1 gets you 160+ images. One asynchronous API covers both images and video: submit a task to get an ID, then fetch the result by callback. Batches of tens of thousands of images do not time out, and switching models needs no code changes. Pay as you go, no monthly fee.")
                    appendLine()
                    withLink(LinkAnnotation.Url("https://go.apimart.ai/gh-rikkahub")) {
                        withStyle(SpanStyle(MaterialTheme.colorScheme.primary)) {
                            append("Sign up through this link to get started")
                        }
                    }
                }
            )
        },
    ),
    ProviderSetting.OpenAI(
        id = Uuid.parse("aecf04fd-cb5c-4582-aed2-e8bf393923fd"),
        name = "Suixiang AI Gateway",
        baseUrl = "https://sui-xiang.com/v1",
        apiKey = "",
        enabled = true,
        description = {
            Text(
                text = buildAnnotatedString {
                    append("A reliable and efficient API relay service for Claude, Codex, Gemini and more. Privacy-focused, no data resale, no diluted models, credits topped up 1:1, pay as you go. Redundant multi-line routing, cross-region disaster recovery and automatic failover keep long-running SSE connections uninterrupted.")
                    appendLine()
                    append("Website: ")
                    withLink(LinkAnnotation.Url("https://sui-xiang.com")) {
                        withStyle(SpanStyle(MaterialTheme.colorScheme.primary)) {
                            append("https://sui-xiang.com")
                        }
                    }
                }
            )
        },
    ),
    ProviderSetting.OpenAI(
        id = Uuid.parse("afbc54ad-807e-4455-9594-7d7a546356ad"),
        name = "MaruCode",
        baseUrl = "https://api.muteki.site/v1",
        apiKey = "",
        enabled = true,
        description = {
            Text(
                text = buildAnnotatedString {
                    append("MaruCode is a small API site that occasionally does charity work. It runs its own account pool and mainly offers mainstream models such as Codex, Claude Code and GPT Image, with WebSocket support, clear pricing (Codex 0.25x, CC 1.5x) and a transparent exchange rate (1:1).")
                    appendLine()
                    withLink(LinkAnnotation.Url("https://api.muteki.site/register?aff=Rikkahub&promo=Rikkahub")) {
                        withStyle(SpanStyle(MaterialTheme.colorScheme.primary)) {
                            append("New users get $2 free on sign-up")
                        }
                    }
                    appendLine()
                    withLink(LinkAnnotation.Url("https://images-2.muteki.site")) {
                        withStyle(SpanStyle(MaterialTheme.colorScheme.primary)) {
                            append("Image generation workbench🖼️")
                        }
                    }
                }
            )
        },
        useResponseApi = true,
    ),
)
