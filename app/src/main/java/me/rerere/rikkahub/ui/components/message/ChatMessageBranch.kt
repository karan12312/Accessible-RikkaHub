package me.rerere.rikkahub.ui.components.message

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons
import me.rerere.hugeicons.stroke.ArrowLeft01
import me.rerere.hugeicons.stroke.ArrowRight01
import me.rerere.rikkahub.R
import me.rerere.rikkahub.data.model.MessageNode

@Composable
fun ChatMessageBranchSelector(
    node: MessageNode,
    modifier: Modifier = Modifier,
    onUpdate: (MessageNode) -> Unit,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(0.dp),
    ) {
        if (node.messages.size > 1) {
            val actionColor = MaterialTheme.colorScheme.onSurfaceVariant
            val canGoPrevious = node.selectIndex > 0
            val canGoNext = node.selectIndex < node.messages.lastIndex

            Icon(
                imageVector = HugeIcons.ArrowLeft01,
                contentDescription = stringResource(R.string.a11y_branch_previous),
                modifier = Modifier
                    .clip(CircleShape)
                    .alpha(if (canGoPrevious) 1f else 0.5f)
                    .clickable(
                        enabled = canGoPrevious,
                        role = Role.Button,
                        onClick = { onUpdate(node.copy(selectIndex = node.selectIndex - 1)) }
                    )
                    .minimumInteractiveComponentSize()
                    .padding(12.dp)
                    .size(24.dp),
                tint = actionColor
            )

            val position = stringResource(
                R.string.a11y_branch_position,
                node.selectIndex + 1,
                node.messages.size
            )
            Text(
                text = "${node.selectIndex + 1}/${node.messages.size}",
                style = MaterialTheme.typography.bodySmall,
                color = actionColor,
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .clearAndSetSemantics { contentDescription = position }
            )

            Icon(
                imageVector = HugeIcons.ArrowRight01,
                contentDescription = stringResource(R.string.a11y_branch_next),
                modifier = Modifier
                    .clip(CircleShape)
                    .alpha(if (canGoNext) 1f else 0.5f)
                    .clickable(
                        enabled = canGoNext,
                        role = Role.Button,
                        onClick = { onUpdate(node.copy(selectIndex = node.selectIndex + 1)) }
                    )
                    .minimumInteractiveComponentSize()
                    .padding(12.dp)
                    .size(24.dp),
                tint = actionColor
            )
        }
    }
}
